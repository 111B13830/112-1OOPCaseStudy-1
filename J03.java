class LCD {
    int a10 = 2000;
    int b15 = 2500;
    int c17 = 3000;
}

class CPU {
    int a166 = 6000;
    int b22 = 8000;
    int c24 = 11000;
}

class HD {
    int a120G = 2400;
    int b160G = 2800;
}

class MiniNote {
    LCD lcd = new LCD();
    CPU cpu = new CPU();
    HD hd = new HD();

    int calculateCost() {
        return (lcd.a10 + cpu.a166 + hd.a120G) * 14 / 10; // 1.4 times the cost
    }

    int calculatePrice() {
        return  (lcd.a10 + cpu.a166 + hd.a120G)* 2; // Twice the cost for pricing
    }
}

class Note15 {
    LCD lcd = new LCD();
    CPU cpu = new CPU();
    HD hd = new HD();

    int calculateCost() {
        return (lcd.b15 + cpu.b22 + hd.b160G) * 14 / 10; // 1.4 times the cost
    }

    int calculatePrice() {
        return (lcd.b15 + cpu.b22 + hd.b160G) * 2; // Twice the cost for pricing
    }
}

class PC {
    LCD lcd = new LCD();
    CPU cpu = new CPU();
    HD hd = new HD();

    int calculateCost() {
        return (cpu.c24+hd.b160G+500); // 1.4 times the cost
    }

    int calculatePrice() {
        return  (cpu.c24+hd.b160G)* 18/10; // Twice the cost for pricing
    }
}

class MultiPC{
    LCD lcd = new LCD();
    CPU cpu = new CPU();
    HD hd = new HD();

    int calculateCost(int a ,int b) {
        return (cpu.c24*a+hd.b160G*b) * 12 / 10; // 1.4 times the cost
    }

    int calculatePrice(int a ,int b) {
        return (cpu.c24*a+hd.b160G*b) * 18 / 10; // Twice the cost for pricing
    }
}
class ALLPC {
    Note15 note15 = new Note15();
    PC pc = new PC();
    // 撰寫比較價格的方法
    boolean isExpensive() {
        int pcPrice = pc.calculatePrice();
        int note15Price = note15.calculatePrice();

        return note15Price > pcPrice;
    }
}
public class J03 {
    public static void main(String[] args) {
        ALLPC allpc = new ALLPC();
        boolean note15IsExpensive = allpc.isExpensive();

        if (note15IsExpensive) {
            System.out.println("Note15比較PC來的貴。");
        } else {
            System.out.println("PC比較Note15來的貴。");
        }
    }
}
//建立類別 LCD CPU HD //
//建立類別 MiniNote 宣告變數 lcd cpu hd 裡面的值從 LCD CPD HD 賦予的//
//建立類別 Note15   宣告變數 lcd cpu hd 裡面的值從 LCD CPD HD 賦予的//
//計算呈成本呼叫用lcd cpu hd 裡的值 回傳到calculateCost裡//
//計算呈定價呼叫用lcd cpu hd 裡的值 回傳到calculatePrice裡//
//最後設一個新物件印出成本及定價//
