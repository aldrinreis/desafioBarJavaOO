package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double ticket (){
        if(gender == 'F'){
            return 8.0;
        }else {
            return 10.0;
        }
    }

    public double feeding(){
        return (beer * 5.0) + (softDrink * 3.0) + (barbecue * 7.0);
    }

    public double cover (){
        if(feeding() > 30){
            return 0.0;
        }else {
            return 4.0;
        }

    }

    public double total(){
        return cover() + feeding() + ticket();
    }

    public String toString(){
        return "RELATÓRIO: \n"
                + "Consumo = R$ "
                + String.format("%.2f%n", feeding())
                +  ((cover() != 0.0) ? String.format("Couvert = R$ %.2f%n", cover()): "Isento de Couvert%n")
                + "Ingresso = R$ " + String.format("%.2f%n", ticket())
                + "\n"
                + "Valor a pagar = R$ " + String.format("%.2f", total());

    }
}
