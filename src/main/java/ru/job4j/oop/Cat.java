package ru.job4j.oop;

    public class Cat {

        private String food;

        public void eat(String meat) {
            this.food = meat;
        }

        private String name;

        public void giveNick(String nick) {
            this.name = nick;
        }

        public void show() {
            System.out.println(this.name + this.food);
        }

        public static void main(String[] args) {
            Cat gav = new Cat();
            gav.eat("kotleta");
            gav.giveNick("Liza");
            gav.show();

            Cat black = new Cat();
            black.eat("fish");
            black.giveNick("Voron");
            black.show();

            System.out.println("There are black's food.");
            System.out.println("There are gav's food.");
        }
    }