package steamfake.utils;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

import java.awt.*;

public class XChart {

    public static void formatChart(JFreeChart chart) {
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Tùy chỉnh màu sắc
        renderer.setSeriesPaint(0, Color.CYAN); // Màu cột

        // Nền biểu đồ và các phần tử khác
        chart.setBackgroundPaint(new Color(30, 30, 30)); // Nền biểu đồ
        chart.getTitle().setPaint(Color.WHITE); // Màu tiêu đề
        plot.setBackgroundPaint(new Color(30, 30, 30)); // Nền trục
        plot.setDomainGridlinePaint(new Color(50, 50, 50)); // Đường lưới trục x
        plot.setRangeGridlinePaint(new Color(50, 50, 50)); // Đường lưới trục y

        // Màu sắc trục
        plot.getDomainAxis().setTickLabelPaint(Color.WHITE); // Màu nhãn trục x
        plot.getRangeAxis().setTickLabelPaint(Color.WHITE); // Màu nhãn trục y
        plot.getDomainAxis().setLabelPaint(Color.WHITE); // Màu nhãn trục x
        plot.getRangeAxis().setLabelPaint(Color.WHITE); // Màu nhãn trục y
        plot.getDomainAxis().setTickMarkPaint(Color.WHITE); // Màu dấu tick trục x
        plot.getRangeAxis().setTickMarkPaint(Color.WHITE); // Màu dấu tick trục y
        plot.getDomainAxis().setAxisLinePaint(Color.WHITE); // Màu đường trục x
        plot.getRangeAxis().setAxisLinePaint(Color.WHITE); // Màu đường trục y

        // Cấu hình phông chữ và độ dày đường
        plot.getDomainAxis().setTickLabelFont(new Font("Arial", Font.PLAIN, 12));
        plot.getRangeAxis().setTickLabelFont(new Font("Arial", Font.PLAIN, 12));
        plot.getDomainAxis().setLabelFont(new Font("Arial", Font.PLAIN, 12));
        plot.getRangeAxis().setLabelFont(new Font("Arial", Font.PLAIN, 12));
        plot.getDomainAxis().setTickMarkStroke(new BasicStroke(1.2f));
        plot.getRangeAxis().setTickMarkStroke(new BasicStroke(1.2f));
        plot.getDomainAxis().setAxisLineStroke(new BasicStroke(1.2f));
        plot.getRangeAxis().setAxisLineStroke(new BasicStroke(1.2f));
    }

}
