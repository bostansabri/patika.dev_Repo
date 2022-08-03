public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if (this.salary<=1000&&this.salary>0){
            return 0;
        }else{
            double tax=(this.salary*3)/100;
            return tax;
        }
    }

    public int bonus(){
        if (this.workHours>40){
            int bonus;
            bonus=(this.workHours-40)*30;
            return bonus;
        }
        else {
            return 0;
        }
    }

    public double raiseSalary(){
        if (hireYear>2011){
            double artis=(this.salary*5)/100;
            return artis;
        }
        if (hireYear>2001&&hireYear<=2011){
            double artis=(this.salary*10)/100;
            return artis;
        }
        if (hireYear<=2001){
            double artis=(this.salary*15)/100;
            return artis;
        }
        return 0;
    }

    public String toString(){
        double toplamMaas=this.salary+this.bonus()+this.raiseSalary()-this.tax();
        double vergibonusMaas=this.salary+this.bonus()-this.tax();
        System.out.println("Adi: "+this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma Saati: "+this.workHours);
        System.out.println("Baslangic Yili: "+this.hireYear);
        System.out.println("Vergi: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maas Artisi: "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas: "+vergibonusMaas);
        System.out.println("Toplam Maas: "+toplamMaas);

        return null;
    }
}
