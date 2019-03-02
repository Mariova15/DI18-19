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
    /// Interaction logic for VerMaterialesAvituallamiento.xaml
    /// </summary>
    public partial class VerMaterialesAvituallamiento : Window
    {

        public GestionApp gestionApp { get; set; }
        public Avituallamiento avituallamiento { get; set; }

        public VerMaterialesAvituallamiento(GestionApp gestionApp, Avituallamiento avituallamiento)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.avituallamiento = avituallamiento;
            this.DataContext = avituallamiento;
        }

        private void ButtonAnnadir_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterialAvituallamiento annadirMaterialAvituallamiento = new AnnadirMaterialAvituallamiento(
                gestionApp, avituallamiento);
            annadirMaterialAvituallamiento.Show();
        }

        private void ButtonBorrar_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridMaterial.SelectedIndex != -1)
            {
                avituallamiento.listaMateriales.Remove(DataGridMaterial.SelectedItem as Material);
            }
            else {
                MessageBox.Show("Selecciona un material");
            }
        }

        private void ButtonEditar_Click(object sender, RoutedEventArgs e)
        {           
            if (DataGridMaterial.SelectedIndex != -1)
            {
                AnnadirMaterialAvituallamiento annadirMaterialAvituallamiento = new AnnadirMaterialAvituallamiento(
                avituallamiento, DataGridMaterial.SelectedIndex);
                annadirMaterialAvituallamiento.Show();
            }
            else
            {
                MessageBox.Show("Selecciona un material");
            }
        }



    }
}
