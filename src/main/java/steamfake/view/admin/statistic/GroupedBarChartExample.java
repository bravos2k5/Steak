package steamfake.view.admin.statistic;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import steamfake.utils.XChart;

import javax.swing.*;

public class GroupedBarChartExample {

    public static void main(String[] args) {
        // Tạo dataset
        CategoryDataset dataset = createDataset();

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
        XChart.formatChart(chart);
        chart.removeLegend();

        // Hiển thị biểu đồ
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        JFrame frame = new JFrame();
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Thêm dữ liệu vào dataset
        dataset.addValue(10000, "Tổng Doanh Thu", "Tháng 1");
        dataset.addValue(12000, "Tổng Doanh Thu", "Tháng 2");
        dataset.addValue(11000, "Tổng Doanh Thu", "Tháng 3");
        dataset.addValue(13000, "Tổng Doanh Thu", "Tháng 4");
        dataset.addValue(14000, "Tổng Doanh Thu", "Tháng 5");

        return dataset;
    }
}


