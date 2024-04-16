public class Vezba_14 {

    public void modulo(){
    int x = 523134;
    int y = 325423;
    int result = x%y;

         if(result == 0){
        System.out.println("Ostatak deljenja ne postoji.");
    } else if (result > 1000 || result < 1000) {
        System.out.println("Ostatak deljenja brojeva x i y je veci ili manji od 1000: "+result);
    }
}
}
