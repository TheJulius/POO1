package chart;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Html {
	
public static void html(int[] vetor) throws IOException {
		
		String html = "<html>\r\n" + 
				"<head>\r\n" + 
				"  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\">\r\n" + 
				"      google.charts.load('current', {'packages':['bar']});\r\n" + 
				"      google.charts.setOnLoadCallback(drawChart);\r\n" + 
				"\r\n" + 
				"    function drawChart() {\r\n" + 
				"\r\n" + 
				"      var data = new google.visualization.DataTable();\r\n" + 
				"      data.addColumn('number', 'Número de Mortes');\r\n" + 
				"      data.addColumn('number', 'Número de Mortes na sessão');\r\n" + 

				"\r\n" + 
				"      data.addRows([\r\n" + 	dadosGrafico(vetor) +		"      ]);\r\n" + 
				"\r\n" + 
				"      var options = {\r\n" + 
				"        chart: {\r\n" + 
				"          title: 'Número de Mortes',\r\n" + 
				"          subtitle: 'Feito por: Julio Cesar'\r\n" + 
				"        },\r\n" + 
				"        width: 800,\r\n" + 
				"        height: 300,\r\n" + 
				"        axes: {\r\n" + 
				"          x: {\r\n" + 
				"            0: {side: 'top'}\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"      };\r\n" + 
				"\r\n" + 
				"      var chart = new google.charts.Bar(document.getElementById('bar_top_x'));\r\n" + 
				"\r\n" + 
				"      chart.draw(data, google.charts.Bar.convertOptions(options));\r\n" + 
				"    }\r\n" + 
				"  </script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"  <div id=\"bar_top_x\"></div>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"";
		
		
		FileWriter arq = new FileWriter("C:\\Users\\julio\\Área de Trabalho\\grafico.html");
	    PrintWriter gravar = new PrintWriter(arq);
	 
	    gravar.printf(html);
	    arq.close();
	}
	private static String dadosGrafico(int[] vetor) {
		String info = "";
		for (int i = 0; i<vetor.length; i++) {
			info += "[" + String.valueOf(i+1) + ", " + String.valueOf(vetor[i]) +"],\r\n";
		}
		return info;
	}
}


