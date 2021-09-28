void printOwing(){
        printBanner();

        printDetails();
}

void printDetails() {
        System.out.println("name: "
        +name);
        System.out.println("amount:
        " + getOutstanding());
}
