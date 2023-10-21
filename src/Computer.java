public class Computer {

    private int memory;
    private int cpu;
    private String version;
    private String company;


    public int getMemory() {
        return memory;
    }

    public int getCpu() {
        return cpu;
    }

    public String getVersion() {
        return version;
    }

    public String getCompany() {
        return company;
    }


    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public Computer(int memory, int cpu, String version, String company)
    {
        this.memory = memory;
        this.cpu = cpu;
        this.version = version;
        this.company = company;
    }

    public Computer()
    {

    }
}
