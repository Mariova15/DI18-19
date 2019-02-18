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
    /// Lógica de interacción para AnnadirMaterial.xaml
    /// </summary>
    public partial class AnnadirMaterial : Window
    {
        public GestionApp gestionApp { get; set; }
        public Avituallamiento avituallamiento { get; set; }
        public MaterialDisponible materialDisponible { get; set; }
        public List<String> tiposDeMaterial { get; set; }
        private int indexModificar = -1;
        private Boolean modificar = false;

        public AnnadirMaterial(Avituallamiento avituallamiento)
        {
            InitializeComponent();

            this.avituallamiento = avituallamiento;

            tiposDeMaterial = new List<string>() { "Bebida", "Comida", "Material sanitario" };

            materialDisponible = new MaterialDisponible();

            this.DataContext = this;
        }

        public AnnadirMaterial(GestionApp gestionApp)
        {
            InitializeComponent();

            this.gestionApp = gestionApp;

            tiposDeMaterial = new List<string>() { "Bebida", "Comida", "Material sanitario" };

            ButtonAnnadirMaterial.Content = "Crear Material";

            materialDisponible = new MaterialDisponible();

            this.DataContext = this;
        }

        public AnnadirMaterial(Avituallamiento avituallamiento, int indexModificar)
        {
            InitializeComponent();

            this.avituallamiento = avituallamiento;

            tiposDeMaterial = new List<string>() { "Bebida", "Comida", "Material sanitario" };

            ButtonAnnadirMaterial.Content = "Modificar material";

            this.indexModificar = indexModificar;

            this.materialDisponible = avituallamiento.listaMateriales[indexModificar].Clone() as MaterialDisponible;

            this.DataContext = this;
        }

        public AnnadirMaterial(MaterialDisponible material, Boolean modificar, int indexModificar, GestionApp gestionApp)
        {
            InitializeComponent();

            this.avituallamiento = avituallamiento;

            tiposDeMaterial = new List<string>() { "Bebida", "Comida", "Material sanitario" };

            ButtonAnnadirMaterial.Content = "Modificar material";

            this.materialDisponible = material.Clone() as MaterialDisponible;

            this.modificar = modificar;

            this.gestionApp = gestionApp;

            this.indexModificar = indexModificar;

            this.DataContext = this;
        }


        private void ButtonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            if (modificar)
            {
                gestionApp.listaMateriales[indexModificar] = materialDisponible;
            }
            else
            {
                if (gestionApp != null)
                {
                    gestionApp.annadirMaterial(materialDisponible);
                }
                else
                {
                    if (indexModificar != -1)
                    {
                        avituallamiento.listaMateriales[indexModificar] = materialDisponible;
                        MessageBox.Show("Material modificado ");
                    }
                    else
                    {
                        avituallamiento.listaMateriales.Add(materialDisponible);
                        MessageBox.Show("Material añadido ");
                    }
                }
            }
            this.Close();
        }
    }
}
