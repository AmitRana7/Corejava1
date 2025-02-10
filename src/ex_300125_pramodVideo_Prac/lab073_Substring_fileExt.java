package ex_300125_pramodVideo_Prac;

public class lab073_Substring_fileExt {
    public static void main(String[] args) {
        String text = "documents.pdf";
        String extension = text.substring(text.lastIndexOf("."));
        System.out.println(extension);
    }
}
