import java.util.Calendar;

public class Fatura {
    private final Calendar dataVencimento;
    private final Calendar dataPagtoMax;

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public Calendar getDataPagtoMax() {
        return dataPagtoMax;
    }

    private Calendar getDataPagtoMax(Calendar dataVencimento, int diasTolerancia) {
        Calendar data = (Calendar)dataVencimento.clone();
        data.add(Calendar.DATE, diasTolerancia);

        int diaDaSemana = data.get(Calendar.DAY_OF_WEEK);
        if(diaDaSemana == Calendar.SUNDAY)  {
            data.add(Calendar.DATE, 1);
        } else if(diaDaSemana == Calendar.SATURDAY) {
            data.add(Calendar.DATE, 2);
        }

        return data;
    }

    Fatura(Calendar dataVencimento, int diasTolerancia) {
        this.dataVencimento = dataVencimento;
        this.dataPagtoMax = getDataPagtoMax(dataVencimento, diasTolerancia);
    }
}