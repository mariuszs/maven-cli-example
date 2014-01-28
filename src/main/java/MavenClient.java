import org.apache.maven.cli.MavenCli;

import java.io.File;

/**
 * @author Mariusz Smykula
 */
public class MavenClient {
    private static final String[] GOALS = new String[]{"clean", "package", "-Dmaven.test.failure.ignore=true"};

    public static void main(String[] args) {

        System.out.println(new File(".").getAbsolutePath());

        MavenCli cli = new MavenCli();
        cli.doMain(new String[]{"-e", "clean", "install"}, ".", System.out, System.out);
    }
}
