using GestionAvituallamiento.interfaz;
using GestionAvituallamiento.logica;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace GestionAvituallamiento
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        public GestionApp gestionApp { get; set; }

        public MainWindow()
        {
            InitializeComponent();
            this.gestionApp = new GestionApp();
        }

        private void ButtonCrearMaterial_Click(object sender, RoutedEventArgs e)
        {
            CrearMaterial crearMaterial = new CrearMaterial(gestionApp);
            crearMaterial.Show();
        }

        private void ButtonVerMaterial_Click(object sender, RoutedEventArgs e)
        {
            VerMateriales verMateriales = new VerMateriales(gestionApp);
            verMateriales.Show();
        }

        private void ButtonCrearCarrera_Click(object sender, RoutedEventArgs e)
        {
            CrearCarrera crearCarrera = new CrearCarrera(gestionApp);
            crearCarrera.Show();
        }

        private void ButtonVerCarreras_Click(object sender, RoutedEventArgs e)
        {
            VerCarreras verCarreras = new VerCarreras(gestionApp);
            verCarreras.Show();
        }
        
    }
}
