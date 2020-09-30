package chapter1_rensyu2.copy;

// folderとFaleを連結し、完全なファイル名としての文字列を完成させる
public class Main {
    String concatPath(String folder, String file) {
        if(!folder.endsWith("\\")) folder += "\\";
        return folder + file;
    }
}