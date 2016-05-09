
package hagiali;
/* Rolling Dice program
 * It will roll 2 dices 10000 times and show the results
 * May 2, 2016
 * Ayub Hagi Ali
 */


public class RollindDiceAddedUp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice1;
		int dice2;
		int dicetotal;
		
		
		
		String[] roll = new String[]{ "2", "3","4","5","6","7","8","9","10","11","12"};
		
		int [] dicetotal2 = new int [11];
		
		//processing and outputs
		
		for(int i = 0; i <= 9999; i++)
		{
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			dicetotal = dice1 + dice2;
			
			
		
		
		if (dicetotal == 2)
		{
			dicetotal2[0]++;
		}
		if (dicetotal == 3)
		{
			dicetotal2[1]++;
		}
		if (dicetotal == 4)
		{
			dicetotal2[2]++;
		}
		if (dicetotal == 5)
		{
			dicetotal2[3]++;
		}
		if (dicetotal == 6)
		{
			dicetotal2[4]++;
		}
		if (dicetotal == 7)
		{
			dicetotal2[5]++;
		}
		if (dicetotal == 8)
		{
			dicetotal2[6]++;
		}
		if (dicetotal == 9)
		{
			dicetotal2[7]++;
		}
		if (dicetotal == 10)
		{
			dicetotal2[8]++;
		}
		if (dicetotal == 11)
		{
			dicetotal2[9]++;
		}
		if (dicetotal == 12)
		{
			dicetotal2[10]++;
		}
		
		
		}
		
		
		System.out.println("Dice Total			" + "Total times it happened");
		System.out.println("2						" + dicetotal2[0]++);
		System.out.println("3						" + dicetotal2[1]++);
		System.out.println("4						" + dicetotal2[2]++);
		System.out.println("5						" + dicetotal2[3]++);
		System.out.println("6						" + dicetotal2[4]++);
		System.out.println("7						" + dicetotal2[5]++);
		System.out.println("8						" + dicetotal2[6]++);
		System.out.println("9						" + dicetotal2[7]++);
		System.out.println("10						" + dicetotal2[8]++);
		System.out.println("11						" + dicetotal2[9]++);
		System.out.println("12						" + dicetotal2[10]++);
		
	}

}
