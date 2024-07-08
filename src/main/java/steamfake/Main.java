package steamfake;

import com.fasterxml.jackson.core.JsonProcessingException;
import steamfake.dao.AccountDAO;
import steamfake.model.Account;
import steamfake.utils.azure.AzureBlobService;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

//        Game game = new Game();
//        game.setId(UUID.randomUUID());
//        game.setName("The witcher 3");
//        game.setAge(18);
//        game.setGiaTien(180000);
//        game.setPublisherID(AccountDAO.gI().selectByAccount(new Account("admin")).getId());
//        File[] files = new File("D:/The Witcher 3").listFiles();
//        List<String> pathList = new ArrayList<>();
//        for (File file : files) {
//            pathList.add(file.getName());
//        }
//        game.setImages(new ObjectMapper().writeValueAsString(pathList));
//        game.setAvatar("D:/The Witcher 3/header.jpg");
//        game.setMoTa("You are Geralt of Rivia, mercenary monster slayer." +
//                " Before you stands a war-torn, monster-infested continent you can explore at will." +
//                " Your current contract? Tracking down Ciri — the Child of Prophecy," +
//                " a living weapon that can alter the shape of the world.");
//        game.setRam(8 * 1024);
//        game.setRom(10 * 1024);
//        game.setUpdateDate(new Date(System.currentTimeMillis()));
//        game.setVersion("1.0.0");
//        game.setOpened(true);
//        game.setExecPath("game.exe");
//        GameDAO.gI().insert(game);

        AzureBlobService.uploadManyFile("D:/The Witcher 3","games/" +(AccountDAO.gI().selectByAccount(new Account("admin")).getId()) ,"images");
    }
}
