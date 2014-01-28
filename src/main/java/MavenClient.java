import org.apache.maven.cli.MavenCli;

import java.io.File;

/**
 * @author Mariusz Smykula
 */
public class MavenClient {

    public static void main(String[] args) {

        System.out.println(new File(".").getAbsolutePath());

        MavenCli cli = new MavenCli();
        cli.doMain(new String[]{"clean", "install"}, ".", System.out, System.out);
    }
}
