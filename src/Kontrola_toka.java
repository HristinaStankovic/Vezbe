public class Kontrola_toka {

    public static void main(String[] args) {

        byte hero_state=1;

        if(hero_state==1){
            System.out.println("Hero is dead.");
            hero_state=3;
            System.out.println("Alive again, coz: "+hero_state);
        }else{
            if(hero_state==2){
                System.out.println("not superhappy");
            } else if (hero_state==3) {
                System.out.println("I am full heLTHY");
            }
        }
}
}
