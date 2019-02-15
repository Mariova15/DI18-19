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

        public MaterialesAvituallamiento(Avituallamiento avituallamiento)
        {
            InitializeComponent();
            this.avituallamientoTabla = avituallamiento;
            this.DataContext = avituallamientoTabla;
            //MessageBox.Show(avituallamientoTabla.listaMateriales.Count()+"");

        }

        private void ButtonBorrar_Click(object sender, RoutedEventArgs e)
        {
            avituallamientoTabla.listaMateriales.RemoveAt(DataGridMaterial.SelectedIndex);
        }

        private void ButtonEditar_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterial annadirMaterial = new AnnadirMaterial(avituallamientoTabla, DataGridMaterial.SelectedIndex);
            annadirMaterial.Show();
        }
    }
}
