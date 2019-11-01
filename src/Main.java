import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Runtime r=Runtime.getRuntime();

        Process p = r.exec("java -cp my_compiler/ Main " + args[0]);
        p.waitFor();

        Runtime r1=Runtime.getRuntime();
        p = r1.exec("java -cp ToKanga/ Main " + args[0] + "_piglet");
        p.waitFor();

        Runtime r2=Runtime.getRuntime();
        p = r2.exec("java -cp ToMIPS/ Main " + args[0] + "_piglet.kg");
        p.waitFor();
    }

}
