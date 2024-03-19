package test.featuresTest.configurations.Scripts.Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.fail;

public class InputScript {

    public void inputUseTest(WebDriver driver, String xpath, int caracter){
        //identify the input
        WebElement inputOverload = driver.findElement(By.xpath(xpath));
        //clear input data
        inputOverload.clear();
        //write the data
        inputOverload.sendKeys("Vincent Willem van Gogh (holandês: [ˈvɪnsɛnt ˈʋɪləm vɑn ˈɣɔx] ( ouça); Zundert, 30 de março de 1853 – Auvers-sur-Oise, 29 de julho de 1890) foi um pintor pós-impressionista neerlandês. Considerado uma das figuras mais famosas e influentes da história da arte ocidental, criou mais de dois mil trabalhos ao longo de pouco mais de uma década, incluindo 860 pinturas a óleo, grande parte das quais, concluídas nos seus últimos dois anos de vida. As suas obras incluem paisagens, natureza-morta, retratos e autorretratos, caracterizados por cores dramáticas e vibrantes, além de pinceladas impulsivas e expressivas, que contribuíram para as fundações da arte moderna e trouxeram distinção para o estilo do pintor.\n" +
                "\n" +
                "Nascido numa família de classe média alta, Van Gogh começou a desenhar ainda criança, sendo descrito como uma pessoa séria, quieta e pensativa. Trabalhou como vendedor de arte quando jovem e viajava frequentemente. Porém, entrou em depressão depois de ser transferido para Londres. Eventualmente, Van Gogh acabou por se voltar para a religião, tendo passado algum tempo como missionário protestante na Bélgica. Ao longo dos anos enfrentou problemas de saúde e solidão, até começar a pintar em 1881, tendo-se mudado para casa dos seus pais. O seu irmão mais novo, Theo, apoiou-o financeiramente e os dois mantiveram uma duradoura e prolífica correspondência ao longo da vida de ambos. Os seus primeiros trabalhos exploravam o tema da natureza-morta e retratos da vida no campo. Em 1886, Van Gogh mudou-se para Paris onde se encontrou com vanguardistas como Émile Bernard e Paul Gauguin, que se opunham à sensibilidade impressionista. Lá, à medida que produzia suas obras, criou uma nova abordagem às naturezas-mortas e às paisagens, com suas pinturas a assumir cores mais vivas enquanto desenvolvia um estilo que se estabeleceu por completo em 1888, durante a sua estadia em Arles. Durante esse período, o pintor também ampliou seus temas que passaram a incluir oliveiras, ciprestes, campos de trigo e girassóis.\n" +
                "\n" +
                "Durante a sua vida, Vincent teve episódios psicóticos e delírios, temendo pela sua estabilidade mental e negligenciando frequentemente a sua saúde física, por um lado, ao não manter uma alimentação regular e, por outro lado, bebendo muito. Sua amizade com Gauguin terminou numa briga que culminou com um ataque de fúria de Van Gogh, durante o qual, cortou parte de sua própria orelha esquerda com uma lâmina. Acabou por passar algum tempo internado em vários hospitais psiquiátricos, incluindo o período passado no Saint-Rémy-de-Provence. Depois Vincent Willem van Gogh (holandês: [ˈvɪnsɛnt ˈʋɪləm vɑn ˈɣɔx] ( ouça); Zundert, 30 de março de 1853 – Auvers-sur-Oise, 29 de julho de 1890) foi um pintor pós-impressionista neerlandês. Considerado uma das figuras mais famosas e influentes da história da arte ocidental, criou mais de dois mil trabalhos ao longo de pouco mais de uma década, incluindo 860 pinturas a óleo, grande parte das quais, concluídas nos seus últimos dois anos de vida. As suas obras incluem paisagens, natureza-morta, retratos e autorretratos, caracterizados por cores dramáticas e vibrantes, além de pinceladas impulsivas e expressivas, que contribuíram para as fundações da arte moderna e trouxeram distinção para o estilo do pintor.\n" +
                "\n" +
                "Nascido numa família de classe média alta, Van Gogh começou a desenhar ainda criança, sendo descrito como uma pessoa séria, quieta e pensativa. Trabalhou como vendedor de arte quando jovem e viajava frequentemente. Porém, entrou em depressão depois de ser transferido para Londres. Eventualmente, Van Gogh acabou por se voltar para a religião, tendo passado algum tempo como missionário protestante na Bélgica. Ao longo dos anos enfrentou problemas de saúde e solidão, até começar a pintar em 1881, tendo-se mudado para casa dos seus pais. O seu irmão mais novo, Theo, apoiou-o financeiramente e os dois mantiveram uma duradoura e prolífica correspondência ao longo da vida de ambos. Os seus primeiros trabalhos exploravam o tema da natureza-morta e retratos da vida no campo. Em 1886, Van Gogh mudou-se para Paris onde se encontrou com vanguardistas como Émile Bernard e Paul Gauguin, que se opunham à sensibilidade impressionista. Lá, à medida que produzia suas obras, criou uma nova abordagem às naturezas-mortas e às paisagens, com suas pinturas a assumir cores mais vivas enquanto desenvolvia um estilo que se estabeleceu por completo em 1888, durante a sua estadia em Arles. Durante esse período, o pintor também ampliou seus temas que passaram a incluir oliveiras, ciprestes, campos de trigo e girassóis.\n" +
                "\n" +
                "Durante a sua vida, Vincent teve episódios psicóticos e delírios, temendo pela sua estabilidade mental e negligenciando frequentemente a sua saúde física, por um lado, ao não manter uma alimentação regular e, por outro lado, bebendo muito. Sua amizade com Gauguin terminou numa briga que culminou com um ataque de fúria de Van Gogh, durante o qual, cortou parte de sua própria orelha esquerda com uma lâmina. Acabou por passar algum tempo internado em vários hospitais psiquiátricos, incluindo o período passado no Saint-Rémy-de-Provence. DepoisVincent Willem van Gogh (holandês: [ˈvɪnsɛnt ˈʋɪləm vɑn ˈɣɔx] ( ouça); Zundert, 30 de março de 1853 – Auvers-sur-Oise, 29 de julho de 1890) foi um pintor pós-impressionista neerlandês. Considerado uma das figuras mais famosas e influentes da história da arte ocidental, criou mais de dois mil trabalhos ao longo de pouco mais de uma década, incluindo 860 pinturas a óleo, grande parte das quais, concluídas nos seus últimos dois anos de vida. As suas obras incluem paisagens, natureza-morta, retratos e autorretratos, caracterizados por cores dramáticas e vibrantes, além de pinceladas impulsivas e expressivas, que contribuíram para as fundações da arte moderna e trouxeram distinção para o estilo do pintor.\n" +
                "\n" +
                "Nascido numa família de classe média alta, Van Gogh começou a desenhar ainda criança, sendo descrito como uma pessoa séria, quieta e pensativa. Trabalhou como vendedor de arte quando jovem e viajava frequentemente. Porém, entrou em depressão depois de ser transferido para Londres. Eventualmente, Van Gogh acabou por se voltar para a religião, tendo passado algum tempo como missionário protestante na Bélgica. Ao longo dos anos enfrentou problemas de saúde e solidão, até começar a pintar em 1881, tendo-se mudado para casa dos seus pais. O seu irmão mais novo, Theo, apoiou-o financeiramente e os dois mantiveram uma duradoura e prolífica correspondência ao longo da vida de ambos. Os seus primeiros trabalhos exploravam o tema da natureza-morta e retratos da vida no campo. Em 1886, Van Gogh mudou-se para Paris onde se encontrou com vanguardistas como Émile Bernard e Paul Gauguin, que se opunham à sensibilidade impressionista. Lá, à medida que produzia suas obras, criou uma nova abordagem às naturezas-mortas e às paisagens, com suas pinturas a assumir cores mais vivas enquanto desenvolvia um estilo que se estabeleceu por completo em 1888, durante a sua estadia em Arles. Durante esse período, o pintor também ampliou seus temas que passaram a incluir oliveiras, ciprestes, campos de trigo e girassóis.\n" +
                "\n" +
                "Durante a sua vida, Vincent teve episódios psicóticos e delírios, temendo pela sua estabilidade mental e negligenciando frequentemente a sua saúde física, por um lado, ao não manter uma alimentação regular e, por outro lado, bebendo muito. Sua amizade com Gauguin terminou numa briga que culminou com um ataque de fúria de Van Gogh, durante o qual, cortou parte de sua própria orelha esquerda com uma lâmina. Acabou por passar algum tempo internado em vários hospitais psiquiátricos, incluindo o período passado no Saint-Rémy-de-Provence. Depois");
        //check if the character condition is correct
        String textInput =inputOverload.getAttribute("value");
        if(textInput.length() > caracter){
            fail();
        }
    }

    public void inputUseTest(WebDriver driver, String xpath){
        //identify the input
        WebElement inputCaracter = driver.findElement(By.xpath(xpath));
        //clear input data
        inputCaracter.clear();
        //write the data
        inputCaracter.sendKeys("||||||//////////////{{{{{{}}}}}}}}}}¨¨¨¨¨¨((()(()()()(()()((())''''''''''''''''''");
        //check if the character condition is correct
        String textInput = inputCaracter.getAttribute("value");
        if(textInput == "||||||//////////////{{{{{{}}}}}}}}}}¨¨¨¨¨¨((()(()()()(()()((())''''''''''''''''''"){
            fail();
        }
    }

    public void inputUseTest(WebDriver driver, String xpath, String text){
        //identify the input
        WebElement inputOverload = driver.findElement(By.xpath(xpath));
        //clear input data
        inputOverload.clear();
        //write the data
        inputOverload.sendKeys(text);
    }

}
