public class PC extends Computer{

    private String display;
    private String keyboard;
    private String mouse;


    public String getDisplay() {
        return display;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    @Override
    public String getVersion() {
        return super.getVersion() + " - PC";
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }


    public PC(int memory, int cpu, String version, String company, String display, String keyboard, String mouse)
    {
        super(memory, cpu, version, company);
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
    public PC()
    {

    }
}
