import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hesapmakinesi {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        JTextField ekran = new JTextField();
        jf.setLayout(new BorderLayout());
        ekran.setFont(new Font(null, Font.BOLD, 40));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4, 4, 10, 10));
        ekran.setPreferredSize(new Dimension(500,100));
        panel1.setPreferredSize(new Dimension(500, 400));
        JButton buton1 = new JButton("1");
        JButton buton2 = new JButton("2");
        JButton buton3 = new JButton("3");
        JButton buton4 = new JButton("4");
        JButton buton5 = new JButton("5");
        JButton buton6 = new JButton("6");
        JButton buton7 = new JButton("7");
        JButton buton8 = new JButton("8");
        JButton buton9 = new JButton("9");
        JButton buton0 = new JButton("0");
        JButton temizle = new JButton("C");
        
        JButton esittir = new JButton("=");

        JButton toplama = new JButton("+");
        JButton çıkarma = new JButton("-");
        JButton çarpma = new JButton("*");
        JButton bölme = new JButton("/");
        esittir.setPreferredSize(new Dimension(500,100));

        panel1.add(buton1);
        panel1.add(buton2);
        panel1.add(buton3);
        panel1.add(toplama);
        panel1.add(buton4);
        panel1.add(buton5);
        panel1.add(buton6);
        panel1.add(çıkarma);
        panel1.add(buton7);
        panel1.add(buton8);
        panel1.add(buton9);
        panel1.add(çarpma);
        panel1.add(temizle);
        panel1.add(buton0);
        panel1.add(esittir);
        panel1.add(bölme);
        buton0.setBackground(Color.YELLOW);
        buton1.setBackground(Color.YELLOW);
        buton2.setBackground(Color.YELLOW);
        buton3.setBackground(Color.YELLOW);
        buton4.setBackground(Color.YELLOW);
        buton5.setBackground(Color.YELLOW);
        buton6.setBackground(Color.YELLOW);
        buton7.setBackground(Color.YELLOW);
        buton8.setBackground(Color.YELLOW);
        buton9.setBackground(Color.YELLOW);
        esittir.setBackground(Color.RED);
        toplama.setBackground(Color.GREEN);
        çıkarma.setBackground(Color.GREEN);
        çarpma.setBackground(Color.GREEN);
        bölme.setBackground(Color.GREEN);
        temizle.setBackground(Color.BLUE);
        panel1.setBackground(Color.BLACK);
        ekran.setBackground(new Color(245,245,220));
        
        buton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"0");
            }
        });
        buton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"1");
            }
        });
        buton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"2");
            }
        });
        buton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"3");
            }
        });
        buton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"4");
            }
        });
        buton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"5");
            }
        });
        buton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ekran.setText(ekran.getText() + "6");
            }
        });

        buton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"7");
            }
        });
        buton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"8");
            }
        });
        buton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"9");
            }
        });
        toplama.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"+");
            }
        });
        çıkarma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"-");
            }
        });
        çarpma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"x");
            }
        });
        bölme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText(ekran.getText()+"/");
            }
        });
        
        esittir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ){
                String metin = ekran.getText();
                String[] parcalar = metin.split("[+\\-x/*]");
                if (metin.contains(",")){
                    JOptionPane.showMessageDialog(null, "Lütfen ',' yerine '.' kullanınız.", "uyarı", JOptionPane.WARNING_MESSAGE);
                }
                
                else{
                if (parcalar.length >= 3){
                    JOptionPane.showMessageDialog(null, "Lütfen sadece bir işlem girerek ilerleyiniz!","uyarı",JOptionPane.WARNING_MESSAGE);
                    ekran.setText("");
                } else if(parcalar.length < 2){
                    JOptionPane.showMessageDialog(null, "Lütfen sayı - işlem - sayı olacak şekilde 2 sayı ve bir işlem seçniz!","uyarı",JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        Float sonuc = Float.parseFloat(parcalar[0]);
                        char işlem = metin.charAt(parcalar[0].length());
                        Float sayı = Float.parseFloat(parcalar[1]);
                        switch(işlem){
                            case '+':
                                sonuc += sayı;
                                break;
                            case '-':
                                sonuc -= sayı;
                                break;
                            case 'x':
                                sonuc *= sayı;
                                break;
                            case '*':
                                sonuc *= sayı;
                                break;
                            case '/':
                                if (sayı==0){
                                    JOptionPane.showMessageDialog(null, "Payda 0 olamaz ", "uyarı", JOptionPane.WARNING_MESSAGE);
                                    ekran.setText("");
                                }
                                sonuc /= sayı;
                                break;
                        }
                        ekran.setText(String.valueOf(sonuc));
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Lütfen sadece sayı giriniz","uyarı",JOptionPane.ERROR_MESSAGE);
                        ekran.setText("");
                    }
                }}
            }
        });
        
        ekran.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ){
                String metin = ekran.getText();
                String[] parcalar = metin.split("[+\\-x/*]");
                if (metin.contains(",")){
                    JOptionPane.showMessageDialog(null, "Lütfen ',' yerine '.' kullanınız. ", "uyarı", JOptionPane.WARNING_MESSAGE);
                }
                else{
                if (parcalar.length >= 3){
                    JOptionPane.showMessageDialog(null, "Lütfen sadece bir işlem girerek ilerleyiniz!","uyarı",JOptionPane.WARNING_MESSAGE);
                    ekran.setText("");
                } else if(parcalar.length < 2){
                    JOptionPane.showMessageDialog(null, "Lütfen sayı - işlem - sayı olacak şekilde 2 sayı ve bir işlem seçniz!","uyarı",JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        Float sonuc = Float.parseFloat(parcalar[0]);
                        char işlem = metin.charAt(parcalar[0].length());
                        Float sayı = Float.parseFloat(parcalar[1]);
                        switch(işlem){
                            case '+':
                                sonuc += sayı;
                                break;
                            case '-':
                                sonuc -= sayı;
                                break;
                            case 'x':
                                sonuc *= sayı;
                                break;
                            case '*':
                                sonuc *= sayı;
                                break;
                            case '/':
                            if (sayı==0){
                                JOptionPane.showMessageDialog(null, "Payda 0 olamaz ", "uyarı", JOptionPane.WARNING_MESSAGE);
                                ekran.setText("");
                            }
                                sonuc /= sayı;
                                break;
                        }
                        ekran.setText(String.valueOf(sonuc));
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Lütfen sadece sayı giriniz","uyarı",JOptionPane.ERROR_MESSAGE);
                        ekran.setText("");
                    }
                }
            }}
        });
        
        

        temizle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ekran.setText("");
                

            }
        });



        jf.add(ekran, BorderLayout.NORTH);
        jf.add(panel1, BorderLayout.CENTER);
        
        jf.setVisible(true);
    }
}
