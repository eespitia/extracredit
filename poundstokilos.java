import java.util.Random;

public class poundstokilos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Random rn = new Random();
        int answer = rn.nextInt(300) + 1;

        System.out.print(answer + " pounds is about ");
        double kilos = (answer * .45);
        System.out.print (kilos + " kilograms");
	}

}