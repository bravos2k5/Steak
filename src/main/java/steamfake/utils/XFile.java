package steamfake.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class XFile {

    /**
     * Copy file từ chỗ này qua chỗ kia
     * @param from từ chỗ này
     * @param to qua chỗ kia
     */
    public static void copyFile(String from, String to){
        try {
            File fromFile = new File(from);
            File toFile = new File(to);
            toFile.delete();
            if(fromFile.exists()) {
                Files.copy(Path.of(from), Path.of(to));
            }
        } catch (IOException e) {
            // Message here
            throw new RuntimeException(e);
        }
    }

    public static void unzip(String zipFilePath, String destDir) {
        File dir = new File(destDir);
        if (!dir.exists()) dir.mkdirs();
        byte[] buffer = new byte[1024];
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                File newFile = newFile(dir, zipEntry);
                if (zipEntry.isDirectory()) {
                    if (!newFile.isDirectory() && !newFile.mkdirs()) {
                        throw new IOException("Failed to create directory " + newFile);
                    }
                } else {
                    File parent = newFile.getParentFile();
                    if (!parent.isDirectory() && !parent.mkdirs()) {
                        throw new IOException("Failed to create directory " + parent);
                    }
                    try (FileOutputStream fos = new FileOutputStream(newFile)) {
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, len);
                        }
                        fos.flush();
                    }
                }
                zipEntry = zis.getNextEntry();
            }
            zis.closeEntry();
        } catch (IOException e) {
            // Message here
            e.printStackTrace();
        }
    }

    private static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());

        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();

        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }

        return destFile;
    }

    public static void zipFolder(String sourceFolder, String zipFile) {
        try {
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            new File(zipFile).delete();
            File folder = new File(sourceFolder);
            compressFolder(folder, folder.getName(), zos);

            zos.close();
            fos.close();
        } catch (IOException e) {
            new File(zipFile).deleteOnExit();
            XMessage.alert(null, "Lỗi: " + e.getMessage());
        }
    }

    private static void compressFolder(File folder, String parentFolder, ZipOutputStream zos) throws IOException {
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    compressFolder(file, parentFolder + "/" + file.getName(), zos);
                } else {
                    addFileToZip(file, parentFolder, zos);
                }
            }
        }
    }

    private static void addFileToZip(File file, String parentFolder, ZipOutputStream zos) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        String zipEntryName = parentFolder + "/" + file.getName();
        ZipEntry zipEntry = new ZipEntry(zipEntryName);
        zos.putNextEntry(zipEntry);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) >= 0) {
            zos.write(buffer, 0, length);
        }

        zos.closeEntry();
        fis.close();
    }

    public static void runExeFile(String path) throws IOException {
        ProcessBuilder builder = new ProcessBuilder(path);
        builder.start();
    }

}
