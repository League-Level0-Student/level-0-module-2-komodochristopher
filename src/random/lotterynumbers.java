package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumbers {
public static void main(String[] args) {
int random1=new Random().nextInt(5) ;

int random2=new Random().nextInt(5) ;

int random3=new Random().nextInt(5) ;

int random4=new Random().nextInt(5) ;

int random5=new Random().nextInt(5) ;

JOptionPane.showMessageDialog(null, random1+ ","+ random2+ "," + random3 +","+ random4+ ","+ random5);
}
}


