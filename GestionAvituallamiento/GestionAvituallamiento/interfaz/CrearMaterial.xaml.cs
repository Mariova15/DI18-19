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
    /// Interaction logic for CrearMaterial.xaml
    /// </summary>
    public partial class CrearMaterial : Window
    {
        public GestionApp gestionApp { get; set; }
        public Material material { get; set; }
        public List<String> tiposDeMaterial { get; set; }
        private int numErrores = 0;
        private int indexModificar = -1;

        public CrearMaterial(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.material = new Material();
            tiposDeMaterial = new List<string>() { "Bebida", "Comida", "Material sanitario" };
            this.DataContext = this;
        }

        public CrearMaterial(GestionApp gestionApp, int indexModificar)
        {
            InitializeComponent();
            this.material = gestionApp.listaMateriales[indexModificar].Clone() as Material;
            this.gestionApp = gestionApp;
            this.indexModificar = indexModificar;
            ButtonAnnadirMaterial.Content = "Modificar";
            tiposDeMaterial = new List<string>() { "Bebida", "Comida", "Material sanitario" };
            this.DataContext = this;
        }

        private void ButtonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            if(indexModificar != -1){
                gestionApp.listaMateriales[indexModificar] = material;
                MessageBox.Show("Material modificado");
            }
            else{
            gestionApp.annadirMaterial(material);
            MessageBox.Show("Material creado");
            }
            this.Close();
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
