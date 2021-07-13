public class colors {

    static class Red {
        public void show(){
            System.out.println("I am red");
        }
    }

    static class Orange extends Red {
        @Override
        public void show(){
            System.out.println("I am orange");
        }
    }

    public class Colors {
        public void main(String[] args) {
            Red redObj = new Red();
            Orange orangeObj = new Orange();
            redObj.show();
            orangeObj.show();
        }
    }
}
