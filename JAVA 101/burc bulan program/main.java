//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int gun, ay;
        Scanner scn = new Scanner(System.in);

        System.out.print("Dogdugunuz Ayi Giriniz: ");
        ay = scn.nextInt();
        System.out.print("Dogdugunuz Gunu Giriniz: ");
        gun = scn.nextInt();


        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    System.out.println("Oglak Burcu.");
                } else {
                    System.out.println("Kova Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 2) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 20) {
                    System.out.println("Kova Burcu.");
                } else {
                    System.out.println("Balik Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    System.out.println("Balik Burcu.");
                } else {
                    System.out.println("Koc Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 4) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    System.out.println("Koc Burcu.");
                } else {
                    System.out.println("Boga Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    System.out.println("Boga Burcu.");
                } else {
                    System.out.println("Ikizler Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 6) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Ikizler Burcu.");
                } else {
                    System.out.println("Yengec Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Yengec Burcu.");
                } else {
                    System.out.println("Aslan Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Aslan Burcu.");
                } else {
                    System.out.println("Basak Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 9) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Basak Burcu.");
                } else {
                    System.out.println("Terazi Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    System.out.println("Terazi Burcu.");
                } else {
                    System.out.println("Akrep Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 11) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    System.out.println("Akrep Burcu.");
                } else {
                    System.out.println("Yay Burcu.");
                }
            } else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    System.out.println("Yay Burcu.");
                } else {
                    System.out.println("Oglak Burcu.");
                }
            }else {
                System.out.println("Yanlis Gun Girdiniz!");
            }
        }

        if (ay<1||ay>12){
            System.out.println("Yanlis Ay Girdiniz!");
        }
    }
}
