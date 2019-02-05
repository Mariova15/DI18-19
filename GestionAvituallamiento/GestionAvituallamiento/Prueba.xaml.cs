using GestionAvituallamiento.Logica;
using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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
    /// Lógica de interacción para Prueba.xaml
    /// </summary>
    public partial class Prueba : Window
    {

        public ObservableCollection<PersonaContacto> listaPersonas { get; set; }
        //public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }
        GestionApp gestionApp;

        public Prueba(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            //listaAvituallamientos = gestionApp.listaAvituallamientos;

            this.DataContext = gestionApp;

            /*listaPersonas = new ObservableCollection<PersonaContacto>();
            listaPersonas.Add(new PersonaContacto("Alguien", 999));
            listaPersonas.Add(new PersonaContacto("Nadie", 888));
            listaPersonas.Add(new PersonaContacto("todos", 777));*/
        }


    }
}
