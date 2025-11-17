class Pangan {
    public void pretty(){
        System.out.println("My height is 5'6");
    }
}
class Don extends Pangan{
    @Override
    public void pretty(){

        super.pretty();
        System.out.println("I play volleyball");
    }
    public void eat(){
        System.out.println("I don't like beef and pork meat unless it is bacon");
    }
}

class Main{
    public static void main(String[] args) {
        Don bonita = new Don();
        bonita.pretty();
        bonita.eat();
    }
}
