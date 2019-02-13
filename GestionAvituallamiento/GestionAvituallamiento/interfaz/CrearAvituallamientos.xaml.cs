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
    /// Lógica de interacción para CrearAvituallamientos.xaml
    /// </summary>
    public partial class CrearAvituallamientos : Window
    {
        GestionApp gestionApp;
        public Avituallamiento avituallamiento { get; set; }
        public PersonaContacto personaContacto { get; set; }
        private int indexModificar = -1;

        public CrearAvituallamientos(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            avituallamiento = new Avituallamiento();
            personaContacto = new PersonaContacto();
            this.DataContext = this;
        }

        public CrearAvituallamientos(GestionApp gestionApp, int indexModificar)
        {
            InitializeComponent();
            ButtonRegistrarAvituallamiento.Content = "Modificar";
            ButtonAnnadirMaterial.Visibility = Visibility.Hidden;
            this.gestionApp = gestionApp;

            //avituallamiento = new Avituallamiento();
            avituallamiento = gestionApp.listaAvituallamientos[indexModificar].Clone() as Avituallamiento;

            //personaContacto = new PersonaContacto();
            personaContacto = gestionApp.listaAvituallamientos[indexModificar].PersonaContacto.Clone() as PersonaContacto;

            this.indexModificar = indexModificar;
            this.DataContext = this;
        }

        private void ButtonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterial annadirMaterial = new AnnadirMaterial(avituallamiento);
            annadirMaterial.ShowDialog();            

        }

        private void ButtonRegistrarAvituallamiento_Click(object sender, RoutedEventArgs e)
        {

            if (indexModificar != -1)
            {
                gestionApp.modificarAvituallamiento(avituallamiento, personaContacto, indexModificar);
            }
            else {
                //MessageBox.Show(personaContacto.Nombre + " " + personaContacto.NumTelf);
                gestionApp.annadirAvituallamiento(avituallamiento, personaContacto);
            }           

            this.Close();
            
        }

    }
}
