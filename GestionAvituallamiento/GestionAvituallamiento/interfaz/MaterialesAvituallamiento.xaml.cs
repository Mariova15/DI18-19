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
    /// Interaction logic for MaterialesAvituallamiento.xaml
    /// </summary>
    public partial class MaterialesAvituallamiento : Window
    {
        public Avituallamiento avituallamientoTabla { get; set; }
        GestionApp gestionApp;

        public MaterialesAvituallamiento(Avituallamiento avituallamiento, GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.avituallamientoTabla = avituallamiento;
            this.DataContext = avituallamientoTabla;
        }

        private void ButtonBorrar_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridMaterial.SelectedIndex != -1)
            {
                avituallamientoTabla.listaMateriales.RemoveAt(DataGridMaterial.SelectedIndex);
            }
            else {
                MessageBox.Show("Seleciona un elemento de la lista");
            }
        }

        private void ButtonEditar_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridMaterial.SelectedIndex != -1)
            {
                AnnadirMaterial annadirMaterial = new AnnadirMaterial(avituallamientoTabla, DataGridMaterial.SelectedIndex);
                annadirMaterial.Show();
            }
            else {
                MessageBox.Show("Seleciona un elemento de la lista");
            }
        }

        private void ButtonAnnadir_Click(object sender, RoutedEventArgs e)
        {
            VerMateriales verMateriales = new VerMateriales(gestionApp, avituallamientoTabla);
            verMateriales.ShowDialog();
        }
    }
}
