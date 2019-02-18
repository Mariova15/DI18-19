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

namespace GestionAvituallamiento
{
    /// <summary>
    /// Lógica de interacción para VerMateriales.xaml
    /// </summary>
    public partial class VerMateriales : Window
    {
        GestionApp gestionApp;
        private Avituallamiento avituallamiento;

        public VerMateriales(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            ButtonAnnadirMaterial.Visibility = Visibility.Hidden;
            this.DataContext = gestionApp;
        }

        public VerMateriales(GestionApp gestionApp, Avituallamiento avituallamiento)
        {
            InitializeComponent();
            this.avituallamiento = avituallamiento;
            ButtonBorrarMaterial.Visibility = Visibility.Hidden;
            ButtonEditarMaterial.Visibility = Visibility.Hidden;
            ButtonCrearMaterial.Visibility = Visibility.Hidden;
            this.DataContext = gestionApp;
        }

        private void ButtonCrearMaterial_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterial annadirMaterial = new AnnadirMaterial(gestionApp);
            annadirMaterial.ShowDialog();         
        }

        private void ButtonBorrarMaterial_Click(object sender, RoutedEventArgs e)
        {
            gestionApp.borrarMaterial(DataGridMateriales.SelectedItem as MaterialDisponible);
        }

        private void ButtonModificarMaterial_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterial annadirMaterial = new AnnadirMaterial(
                DataGridMateriales.SelectedItem as MaterialDisponible, true, DataGridMateriales.SelectedIndex, gestionApp);
            annadirMaterial.Show();
        }

        private void ButtonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            avituallamiento.listaMateriales.Add(DataGridMateriales.SelectedItem as MaterialDisponible);
            MessageBox.Show("Material añadido");
        }
    }
}
