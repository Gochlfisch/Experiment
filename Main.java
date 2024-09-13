
public class Main {

    public static void main() {
        GUI.main();
        checkButton();
    
    }

    
    public static void Ausführen()
    {
        String BananeaberInMain = GUI.getText();
        if (BananeaberInMain == null)
        {
        System.out.println("Error!");
        }
        else{
                System.out.println(BananeaberInMain);
            }
    }

    public static void checkButton(){
        boolean Knopf = GUI.wannKnopf();
        if(Knopf){
            Ausführen();
        }
        else{
            wait(100);
            checkButton();
        }

    }

    public static void wait(int ms)
{
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}
}