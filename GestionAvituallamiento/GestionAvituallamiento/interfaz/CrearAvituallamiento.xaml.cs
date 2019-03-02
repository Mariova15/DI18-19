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
    /// Interaction logic for CrearAvituallamiento.xaml
    /// </summary>
    public partial class CrearAvituallamiento : Window
    {
        public GestionApp gestionApp { get; set; }
        public Carrera carrera { get; set; }
        public Avituallamiento avituallamiento { get; set; }
        public PersonaContacto personaContacto { get; set; }
        private int indexModificar = -1;
        private int numErrores = 0;

        public CrearAvituallamiento(GestionApp gestionApp, Carrera carrera)
        {
            InitializeComponent();
            this.carrera = carrera;
            this.gestionApp = gestionApp;
            this.avituallamiento = new Avituallamiento();
            this.personaContacto = new PersonaContacto();
            this.DataContext = this;
        }

        public CrearAvituallamiento(GestionApp gestionApp, Carrera carrera, int indexModificar)
        {
            InitializeComponent();
            this.carrera = carrera;
            this.indexModificar = indexModificar;
            this.gestionApp = gestionApp;
            this.personaContacto = carrera.listaAvituallamientos[indexModificar].PersonaContacto.Clone() as PersonaContacto;
            this.avituallamiento = carrera.listaAvituallamientos[indexModificar].Clone() as Avituallamiento;
            ButtonCrearAvituallamiento.Content = "Modificar";
            this.DataContext = this;
        }

        private void ButtonCrearAvituallamiento_Click(object sender, RoutedEventArgs e)
        {

            if (indexModificar != -1)
            {
                avituallamiento.PersonaContacto = personaContacto;
                carrera.listaAvituallamientos[indexModificar] = avituallamiento;
                MessageBox.Show("Avituallamiento modificado");
            }
            else
            {
                avituallamiento.PersonaContacto = personaContacto;
                carrera.listaAvituallamientos.Add(avituallamiento);
                MessageBox.Show("Avituallamiento creado");
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
                ButtonCrearAvituallamiento.IsEnabled = true;
            else
                ButtonCrearAvituallamiento.IsEnabled = false;
        }

        private void ButtonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterialAvituallamiento annadirMaterialAvituallamiento = new AnnadirMaterialAvituallamiento(
                gestionApp, avituallamiento);
            annadirMaterialAvituallamiento.Show();
        }
                
    }
}
