package lec_11_file.homework;

/**

 * Which code inserted at  // CODE HERE will compile and run without error on Windows?
 * Какой код вставленный в строку // CODE HERE скомпилируется и запустится без ошибок в Windows? Выбрать все варианты

 * A.  BasicFileAttributes attr = Files.readAttributes(dir, BasicFileAttributes.class);
 * B.  BasicFileAttributes attr = Files.readAttributes(dir, DosFileAttributes.class);
 * C.  DosFileAttributes attr = Files.readAttributes(dir, BasicFileAttributes.class);
 * D.  DosFileAttributes attr = Files.readAttributes(dir, DosFileAttributes.class);
 * E.  PosixFileAttributes attr = Files.readAttributes(dir, PosixFileAttributes.class);
 * F.  BasicFileAttributes attr = new BasicFileAttributes(dir);
 * G.  BasicFileAttributes attr =dir.getBasicFileAttributes();
 */
public class Attributes {
    public void read(Path dir) throws IOException {
        // CODE HERE
        System.out.println(attr.creationTime());
    }
}
