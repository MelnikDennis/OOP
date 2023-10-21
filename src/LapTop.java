public class LapTop extends Computer
{

    private int size;


    public int getSize()
    {
        return size;
    }


    public void setSize(int size)
    {
        this.size = size;
    }


    @Override
    public String getVersion() {
        return super.getVersion() + " - Laptop";
    }

    public LapTop(int memory, int cpu, String version, String company, int size)
    {
        super(memory, cpu, version, company);
        this.size = size;
    }
    public LapTop()
    {

    }
}
