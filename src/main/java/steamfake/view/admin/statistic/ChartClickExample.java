package steamfake.view.admin.statistic;

import org.jfree.chart.*;
import org.jfree.chart.entity.CategoryItemEntity;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class ChartClickExample {

    public static void main(String[] args) {
        // Tạo dataset
        DefaultCategoryDataset dataset = createDataset();

        // Tạo biểu đồ
        JFreeChart chart = ChartFactory.createBarChart(
                "Tổng Doanh Thu Theo Tháng", // Tiêu đề
                "Tháng", // Trục x
                "Tổng Doanh Thu", // Trục y
                dataset, // Dataset
                org.jfree.chart.plot.PlotOrientation.VERTICAL,
                true, // Hiển thị chú giải
                true, // Hiển thị tooltips
                false // Hiển thị URLs
        );

        // Định dạng biểu đồ
        formatChart(chart);

        // Tạo ChartPanel và đăng ký ChartMouseListener
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        chartPanel.addChartMouseListener(new ChartMouseListener() {
            @Override
            public void chartMouseClicked(ChartMouseEvent chartMouseEvent) {
                ChartEntity entity = chartMouseEvent.getEntity();
                if (entity instanceof CategoryItemEntity item) {
                    String category = (String) item.getColumnKey();
                    double value = (double) item.getDataset().getValue(item.getRowKey(), item.getColumnKey());
                    JOptionPane.showMessageDialog(null, "Tháng " + category + ": " + value);
                }
            }

            @Override
            public void chartMouseMoved(ChartMouseEvent chartMouseEvent) {

            }
        });

        // Hiển thị biểu đồ
        JFrame frame = new JFrame();
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Thêm dữ liệu vào dataset
        dataset.addValue(10000, "Tổng Doanh Thu", "Tháng 1");
        dataset.addValue(12000, "Tổng Doanh Thu", "Tháng 2");
        dataset.addValue(11000, "Tổng Doanh Thu", "Tháng 3");
        dataset.addValue(13000, "Tổng Doanh Thu", "Tháng 4");
        dataset.addValue(14000, "Tổng Doanh Thu", "Tháng 5");

        return dataset;
    }

    private static void formatChart(JFreeChart chart) {
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.BLUE); // Màu cột

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


