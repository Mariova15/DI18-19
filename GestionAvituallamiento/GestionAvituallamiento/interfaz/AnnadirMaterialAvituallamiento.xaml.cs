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
    /// Interaction logic for AnnadirMaterialAvituallamiento.xaml
    /// </summary>
    public partial class AnnadirMaterialAvituallamiento : Window
    {
        public GestionApp gestionApp { get; set; }
        public Material material { get; set; }
        public Avituallamiento avituallamiento { get; set; }
        private int indexModificar = -1;
        private int numErrores = 0;

        public AnnadirMaterialAvituallamiento(GestionApp gestionApp, Avituallamiento avituallamiento)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.material = new Material();
            this.avituallamiento = avituallamiento;
            this.DataContext = gestionApp;
            this.TextBoxCantidad.DataContext = material;
        }

        public AnnadirMaterialAvituallamiento(Avituallamiento avituallamiento, int indexModificar)
        {
            InitializeComponent();
            DataGridMaterial.Visibility = Visibility.Hidden;
            ButtonAnnadirMaterial.Content = "Modificar cantidad";
            this.indexModificar = indexModificar;
            this.material = avituallamiento.listaMateriales[indexModificar].Clone() as Material;
            this.avituallamiento = avituallamiento;
            this.TextBoxCantidad.DataContext = material;
        }

        private void ButtonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            if (gestionApp != null)
            {
                Material materialAnnadir = DataGridMaterial.SelectedItem as Material;
                materialAnnadir.Cantidad = material.Cantidad;
                avituallamiento.listaMateriales.Add(materialAnnadir);
                MessageBox.Show("Material añadido");
            }
            else {
                avituallamiento.listaMateriales[indexModificar] = material;
                MessageBox.Show("Material modificado");
                this.Close();
            }

           
        }

        private void Validation_Error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
            {
                numErrores++;
                ((Control)sender).ToolTip = e.Error.ErrorContent;
            }
            else if (e.Action == ValidationErrorEventAction.Removed)
            {
                numErrores--;
                ((Control)sender).ToolTip = null;
            }
            if (numErrores == 0)
                ButtonAnnadirMaterial.IsEnabled = true;
            else
                ButtonAnnadirMaterial.IsEnabled = false;
        }

    }
}
