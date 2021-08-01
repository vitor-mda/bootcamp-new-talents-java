import java.util.Calendar;
import java.util.Locale;

public class AppFatura {
    public static final int DIAS_TOLERANCIA = 10;

    public static void main(String[] args) {
        Calendar umaQuarta = Calendar.getInstance();
        umaQuarta.set(2021, Calendar.JULY, 14);

        Calendar umaQuinta = Calendar.getInstance();
        umaQuinta.set(2021, Calendar.JULY, 15);

        Fatura faturaVenceDomingo = new Fatura(umaQuarta, AppFatura.DIAS_TOLERANCIA);
        Fatura faturaVenceSabado = new Fatura(umaQuinta, AppFatura.DIAS_TOLERANCIA);
        Fatura faturaVenceHoje = new Fatura(Calendar.getInstance(), AppFatura.DIAS_TOLERANCIA);

        Fatura[] faturas = new Fatura[]{faturaVenceDomingo, faturaVenceSabado, faturaVenceHoje};

        for(Fatura fatura : faturas) {
            Calendar dataVencimento = fatura.getDataVencimento();
            Calendar dataPagtoMax = fatura.getDataPagtoMax();

            System.out.printf("%n=========================================" +
                            "%nFatura com vencimento no dia:%n\t%td de %tB de %tY (%s)" +
                            "%n%npoderá ser paga sem juros até o dia:%n\t%td de %tB de %tY (%s)" +
                            "%n=========================================%n",
                    dataVencimento, dataVencimento, dataVencimento, dataVencimento.getDisplayName(
                            Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()),
                    dataPagtoMax, dataPagtoMax, dataPagtoMax, dataPagtoMax.getDisplayName(
                            Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));
        }
    }
}
