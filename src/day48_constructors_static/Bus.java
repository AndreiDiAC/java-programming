package day48_constructors_static;

public class Bus {
    Driver driver = new Driver();
    Engine engine = new Engine();

    public String toString(){
        return driver.getName() + " | " + engine.getCylinder();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }





}

    class Driver{
        private String name;

        public Driver() {
        }

        public Driver(String name){
            this.name = name;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Driver{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    class Engine{
        private int cylinder;

        public Engine(){
        }

        public Engine(int cylinder){
            this.cylinder = cylinder;
        }

        public int getCylinder() {
            return cylinder;
        }

        public void setCylinder(int cylinder) {
            this.cylinder = cylinder;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "cylinder=" + cylinder +
                    '}';
        }
    }

