package com.hz;

public class ChristmasCard extends Card{

    public ChristmasCard(Printer printer) {
        super(printer);
    }

    public void printHeader() {
        this.printer.printLine("--@--@--@----@----@--@----@----@--@--@--");
    }

    public void printMessage() {
        this.printer.printLine("Merry Christmas!");
    }

    public void printImage() {
        this.printer.printLine("           *             ,");
        this.printer.printLine("                       _/^\\_");
        this.printer.printLine("                      <     >");
        this.printer.printLine("     *                 /.-.\\         *");
        this.printer.printLine("              *        `/&\\`                   *");
        this.printer.printLine("                     /_o.I %_\\    *");
        this.printer.printLine("        *           (`'--:o(_@;");
        this.printer.printLine("                   /`;--.,__ `')             *");
        this.printer.printLine("                  ;@`o % O,*`'`&\\");
        this.printer.printLine("            *    (`'--)_@ ;o %'()\\      *");
        this.printer.printLine("                 /`;--._`''--._O'@;");
        this.printer.printLine("                /&*,()~o`;-.,_ `\"\"`)");
        this.printer.printLine("     *          /`,@ ;+& () o*`;-';\\");
        this.printer.printLine("               (`\"\"--.,_0 +% @' &()\\");
        this.printer.printLine("               /-.,_    ``''--....-'`)  *");
        this.printer.printLine("          *    /@%;o`:;'--,.__   __.'\\");
        this.printer.printLine("              ;*,&(); @ % &^;~`\"`o;@();         *");
        this.printer.printLine("              /(); o^~; & ().o@*&`;&%O\\");
        this.printer.printLine("        jgs   `\"=\"==\"\"==,,,.,=\"==\"===\"`");
        this.printer.printLine("           __.----.(\\-''#####---...___...-----._");
        this.printer.printLine("         '`         \\)_`\"\"\"\"\"`");
        this.printer.printLine("                 .--' ')");
        this.printer.printLine("               o(  )_-\\");
        this.printer.printLine("                 `\"\"\"` `");
    }

    public void printFooter() {
        this.printer.printLine("--@--@--@----@----@--@----@----@--@--@--");
    }
}
