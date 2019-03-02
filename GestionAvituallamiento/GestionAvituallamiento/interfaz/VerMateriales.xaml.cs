using GestionAvituallamiento.logica;
using GestionAvituallamiento.modelo;
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
using System.Windows.Shapes;

namespace GestionAvituallamiento.interfaz
{
    /// <summary>
    /// Interaction logic for VerMateriales.xaml
    /// </summary>
    public partial class VerMateriales : Window
    {

        public GestionApp gestionApp { get; set; }

        public VerMateriales(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.DataContext = gestionApp;
        }

        private void ButtonAnnadir_Click(object sender, RoutedEventArgs e)
        {
            CrearMaterial crearMaterial = new CrearMaterial(gestionApp);
            crearMaterial.Show();
        }

        private void ButtonBorrar_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridMaterial.SelectedIndex != -1)
            {
                gestionApp.borrarMaterial(DataGridMaterial.SelectedItem as Material);
            }
            else {
                MessageBox.Show("Selecciona un material");
            }
        }

        private void ButtonEditar_Click(object sender, RoutedEventArgs e)
        {           
            if (DataGridMaterial.SelectedIndex != -1)
            {
                CrearMaterial crearMaterial = new CrearMaterial(gestionApp, DataGridMaterial.SelectedIndex);
                crearMaterial.Show();
            }
            else
            {
                MessageBox.Show("Selecciona un material");
            }
        }
    }
}
