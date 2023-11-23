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
public class J02 {
    public static void main(String[] args) {
        PC pc = new PC();
        System.out.println("pc Cost: " + pc.calculateCost() + ", Price: " + pc.calculatePrice());

        MultiPC multiPC = new MultiPC();
        System.out.println("multiPC Cost: " + multiPC.calculateCost(2,4) + ", Price: " + multiPC.calculatePrice(2,4));
        MultiPC A = new MultiPC();
        System.out.println("multiPC Cost: " + A.calculateCost(4,8) + ", Price: " + A.calculatePrice(4,8));
    }
}

//建立類別 LCD CPU HD //
//建立類別 MiniNote 宣告變數 lcd cpu hd 裡面的值從 LCD CPD HD 賦予的//
//建立類別 Note15   宣告變數 lcd cpu hd 裡面的值從 LCD CPD HD 賦予的//
//計算呈成本呼叫用lcd cpu hd 裡的值 回傳到calculateCost裡//
//計算呈定價呼叫用lcd cpu hd 裡的值 回傳到calculatePrice裡//
//最後設一個新物件印出成本及定價//

