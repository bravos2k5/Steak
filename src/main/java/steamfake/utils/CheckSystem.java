package steamfake.utils;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckSystem {

    /**
     * Tổng RAM
     * @return tổng dung lượng RAM (MB)
     */
    public static long getTotalMemory() {
        SystemInfo si = new SystemInfo();
        GlobalMemory memory = si.getHardware().getMemory();
        return memory.getTotal() / (1024 * 1024);
    }

    /**
     * RAM khả dụng
     * @return RAM còn lại (MB)
     */
    public static long getAvailableMemory() {
        SystemInfo si = new SystemInfo();
        GlobalMemory memory = si.getHardware().getMemory();
        return memory.getAvailable() / (1024 * 1024);
    }

    /**
     * Lấy danh sách ổ đĩa
     * @return List ổ đĩa
     */
    public static List<File> getDisksName() {
        File[] files = File.listRoots();
        return new ArrayList<>(Arrays.stream(files).toList());
    }

    /**
     * Lấy tổng dung lượng ổ đĩa
     * @param disk ổ đĩa
     * @return tổng dung lượng (MB)
     */
    public static long getTotalSpace(File disk) {
        return disk.getTotalSpace() / (1024 * 1024);
    }

    /**
     * Lấy dung lượng còn lại của ổ đĩa
     * @param disk ổ đĩa
     * @return dung lượng còn lại của ổ đĩa (MB)
     */
    public static long getAvailableSpace(File disk) {
        return disk.getUsableSpace() / (1024 * 1024);
    }

}
