import java.util.Map;

public class Produto {
    public static final Map<String, Double> PRECOS = Map.of(
            "spaguetti", 10.0,
            "canelone", 12.0,
            "talharim", 8.0
    );

    public static final Map<String, Integer> PRODUCAO_MAXIMA = Map.of(
            "spaguetti", 2000,
            "canelone", 1600,
            "talharim", 1000
    );

    private String forma;
    private double precoKg;

}