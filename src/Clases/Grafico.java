/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author manza
 */
public class Grafico {
    private XYSeries serie_apple;
    private XYSeries serie_hp;
    private JPanel grafico;
    private Empresa apple;
    private Empresa hp;
    private int counter = 1;

    public Grafico(JPanel grafico, Empresa apple, Empresa hp) {
        this.grafico = grafico;
        this.apple = apple;
        this.hp = hp;
        this.serie_apple = new XYSeries("Apple");
        this.serie_hp = new XYSeries("HP");
        
        JFreeChart lineChart = ChartFactory.createXYLineChart("Utilidad vs Tiempo", "Días", "Utilidad", getDataset(), PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartpanel = new ChartPanel(lineChart);
        
        XYPlot plot = lineChart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.GRAY);  // Serie 0 (Apple)
        renderer.setSeriesPaint(1, Color.BLUE);    // Serie 1 (HP)
        renderer.setSeriesShapesVisible(0, true);  // Mostrar puntos para la serie 0
        renderer.setSeriesShapesVisible(1, true);  // Mostrar puntos para la serie 1
        renderer.setSeriesLinesVisible(0, true);    // Mostrar líneas para la serie 0
        renderer.setSeriesLinesVisible(1, true);    // Mostrar líneas para la serie 1
        renderer.setSeriesStroke(0, new BasicStroke(3.0f)); // Grosor de la línea para la serie 0
        renderer.setSeriesStroke(1, new BasicStroke(3.0f)); // Grosor de la línea para la serie 1

        plot.setRenderer(renderer);

        chartpanel.setPreferredSize(new java.awt.Dimension(700, 500));
        grafico.setLayout(new BorderLayout());
        grafico.add(chartpanel, BorderLayout.CENTER);
        grafico.validate();
    }
    
    private XYSeriesCollection getDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie_apple);
        dataset.addSeries(serie_hp);
        return dataset;
    }
    
    public void actualizarGrafico() {
        serie_apple.add(counter, apple.getUtilidad());
        serie_hp.add(counter, hp.getUtilidad());
        counter ++;
    }
    
}
