-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 20-11-2019 a las 21:50:00
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `id11607027_bdapp1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alabanza`
--

CREATE TABLE `alabanza` (
  `id_a` int(10) NOT NULL,
  `titulo` text COLLATE utf8_unicode_ci NOT NULL,
  `autor` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `letra` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `alabanza`
--

INSERT INTO `alabanza` (`id_a`, `titulo`, `autor`, `letra`) VALUES
(1, 'Me gozo en Jesús ', 'Husband, John J.  ', 'Me gozo en Jesús que su trono de luz Dejó por comprar mi salud en la cruz. \r\nCORO ¡Aleluya el Cordero, ¡De mi vida sostén, Triunfó en el madero! ¡Aleluya! Amén. \r\nMis culpas sentí Y contrito acudí A Cristo, refugio eternal para mi. \r\nY así tengo yo En Jesús que me amó, La paz y el perdón que con sangre compró. \r\nSi hay penas aquí, Gozo eterno hay allí, Do Cristo prepara lugar para mí.\r\n'),
(2, 'No sé cuando será ', 'McGranahan, James.', 'No sé cuándo será que a mi Rey he de ver. Pero sé que a su lado me quiere tener. Cuando venza a la noche la eterna luz. ¡Qué gozo morar con Jesús! \r\nCORO ¡Que gozo morar con Jesús! ¡Que gozo morar con Jesús! Cuando venza a la noche la eterna luz ¡Que gozo morar con Jesús! \r\nYo no sé qué será el cantar de Sion, Ni del himno celeste la dulce expresión; Pero sé que juntando a la suya mi voz. He de alabar al Señor. \r\nYo no sé qué será el palacio de luz, Pero sí que me espera en su trono Jesús, Que sentado a sus plantas feliz he de ser. ¡Oh quién lo pudiera ya ver! \r\n'),
(3, 'Nunca, Dios mío, cesará mi labio ', 'Flemming, Friederich F.  ', 'Nunca, Dios mío, cesará mi labio De bendecirte, de cantar tu gloria, Porque conservo de tu amor inmenso Grata memoria. \r\nCuando perdido en mundanal sendero, No me cercaba sino niebla oscura, Tú me miraste, y alúmbrame un rayo De tu luz pura. \r\nCuando inclinaba mi abatida frente Del mal obrar el oneroso yugo, Dulce reposo y eficaz alivio Darme te plugo. \r\nCuando los dones malgasté a porfía, Con que a mi alma pródigo adornaste, \"Padre he pecado\", con dolor te dije, Y me abrazaste. \r\nCuando en mis propios méritos fiaba, Nunca mi pecho con amor latía; Hoy de amor late, porque en tus bondades Sólo confía. \r\nY cuando exhale mi postrer aliento Para volar a tu eternal presencia, Cierto hallaré con tu justicia unida Dulce clemencia.  \r\n'),
(4, '¡Oh Cristo! en tu muerte ', 'Gordon, Adoniram J. ', '¡Oh Cristo! en tu muerte yo quiero pensar Tu amor me enternece y me hace anhelar Que tengas en mi fruto de tu dolor, Y pongas tu trono en mi corazón. \r\nDe burla una caña cual cetro te dan; Con mofa te viste ropaje real: Te aclaman con befa su Rey y Señor, Mas quiero que reines. en mi corazón. \r\nCorona de espinas es puesta en tu sien; Te dan por bebida vinagre con hiel; Tu Nombre escarnecen de Rey Salvador, Y Tú me has salvado, ¡ bendito Señor! \r\nYo sé que moriste, ¡oh Cristo por mí! Y sé que Tú quieres hacerme feliz; Pues reina Tú siempre. en mi corazón, Sé Rey en mi vida, mi casa y amor.\r\n'),
(5, 'Oh jóvenes, venid ', 'Root, George F.  ', 'Oh jóvenes, venid, su brillante pabellón Cristo ha desplegado hoy en la nación; A todos en sus filas os quiere recibir, Y con El a la pélea os hará salir. \r\nCORO. ¿Vamos a Jesús,  sin temor! ¡ Vamos a la lid inflamados de valor! ¡Jóvenes, luchemos todos contra el mal, En Jesús llevamos nuestro General! \r\n¡ Oh jóvenes, venid! el caudillo Salvador Quiere recibiros en su derredor; Con El a la batalla salid sin vacilar; Vamos pronto, compañeros, ¡vamos a luchar! \r\nLas armas invencibles del Jefe guiador Son el Evangelio y su gran amor; Con ellas revestidos y llenos de poder, ¡ acudamos, vamos a vencer! \r\nLos fieros enemigos, engendros de Satán, Hállanse formados con su capitán; ¡ Oh jóvenes, vosotros poneos sin temor A la diestra de1 Caudillo, nuestro Salvador. \r\nQuien venga a la pelea su voz escuchará; Cristo la victoria le concederá; ¡Salgamos, ¡luchemos, sí, por El! Con Jesús conquistaremos inmortal laurel.'),
(6, 'Para todo viajero ', 'Converse, Charles C.  ', 'Para todo viajero Que camina con tesón Por la senda que conduce A los brazos de su Dios, Hay un faro luminoso Que le presta su fulgor En el Sakro Jesu-Cristo, El bendito Salvador. \r\nPara aquel a quien el mundo Desgarró su corazón, Deshojó sus ilusiones Y su alma marchitó, Hay un bálsamo divino Que le dé consolación, En el Sakro Jesu-Cristo, El bendito Salvador. \r\nPara el hombre que perdido Por el mal que practicó, De su suerte desespera Y fallece de dolor, Hay un médico divino Que le brinda redención En el Sakro Jesu-Cristo, El bendito Salvador.\r\n'),
(7, 'Pecador, ven a Cristo Jesús ', 'Webster, Joseph P.', 'Pecador, ven a Cristo Jesús, Y feliz para siempre serás, Que si tú le quisieres tener, Al divino Señor hallarás. \r\nCORO Ven a El pecador;  Que te espera tu buen Salvador. Ven a El pecador;  Que te espera tu buen Salvador.  \r\nOvejuela que huyó del redil, Da tú voces al buen Salvador, Y en los hombros llevada serás De tan dulce y amante Pastor. \r\nSi cual hijo que ingrato pecó, Vas buscando a sus pies compasión, Tierno padre en Jesús hallarás, Y tendrás en sus brazos perdón. \r\nSi de enfermo te sientes morir, Él será tu doctor celestial, Y hallarás en su sangre también Medicina que cure tu mal.  \r\n'),
(8, 'Por mis pecados pagaste, Jesús ', 'Moody, May Whittle.', 'Por mis pecados pagaste, Jesús, Cuando moriste por mí en la cruz, Yo, constreñido de tanto amor, Quiero servirte, mi fiel Salvador.  \r\nCORO Cada momento me guardas, Señor, Cada momento en tu gracia y amor. Vida divina recibo de Ti, Por tu Espiritu vives en mi. \r\nTodos mis males los cura Jesús: Plena salud alcancé por su cruz. Siempre me tiene presente aquí, Cada momento se acuerda de mí. \r\nTodas mis cuitas las quita Jesús, Llena mi alma de su paz y luz. Todos los días consuelos me da, Cada momento conmigo está.\r\n'),
(9, '¿Quieres ser salvo de toda maldad ? ', 'Jones, Lewis E.  ', '¿Quieres ser salvo de toda maldad? Tan solo hay poder en mi Jesús ¿Quieres vivir y gozar santidad? Tan solo hay poder en Jesús. \r\nCORO Hay poder, hay poder, sin igual poder En Jesús que murió Hay poder, hay poder, sin igual poder en la sangre que él vertió. \r\n¿Quieres ser libre de orgullo y pasión? Tan solo hay poder en mi Jesús ¿Quieres vencer toda cruel tentación? Tan solo hay poder en Jesús. \r\n¿Quieres servir a tu Rey y Señor? Tan solo hay poder en mi Jesús Ven y ser salvo podrás en su amor Tan solo hay poder en Jesús.'),
(10, 'Roca de los siglos ', 'Hastings, Thomas.', 'Roca de los siglos, Tú Fuiste herida, sí, por mí; Anhelando la salud, Yo me escondo, Cristo, en Ti; De la irá sálvame, De mis culpas. láyame. \r\nAunque fuere siempre fiel Y llorare sin cesar, Del pecado no podré Justificación lograr; Ningún precio traigo a Ti, Mas tu cruz es para mí. \r\nMientras tenga que vivir En el valle mundanal, Cuando tenga que subir A tu augusto tribunal, Cúbreme de tu piedad, ¡Roca de la eternidad!\r\n'),
(11, 'Rostro divino ', 'desconocido ', 'Rostro divino, ensangrentado, Cuerpo llagado por nuestro bien, ¡Señor!, llevaste cuántos dolores De pecadores que así te ven \r\nManos preciosas tan lastimadas, Por mí clavadas en una cruz En este valle mis pasos guía, Sé mí alegría, mi norte y luz. \r\nBello costado en cuya herida Halla la vida la humanidad, Fuente amorosa de un Dios clemente, Voz elocuente de caridad. \r\nTus píes heridos, ¡Cristo paciente! Yo, delincuente los taladré; Por Ti salvado ya bendecido Y agradecido te adoraré. \r\n¡Crucificado en un madero, Manso Cordero muerto por mí! ¡Oh!, guarda mi alma, que en Ti, reposa, Siempre dichosa cerca de Ti.\r\n'),
(12, 'Salvo en los tiernos brazos ', 'Doane, William H.  ', 'Salvo en los tiernos brazos De mi Jesús seré, Y en su amoroso pecho Dulce reposaré. Este es sin duda el eco De celestial canción, Que de inefable gozo Llena mi corazón. \r\nCORO Salvo en los tiernos brazos De mi Jesús seré, y en su amoroso pecho Dulce reposaré. \r\nTiende Jesús los brazos, Bríndame su amistad A su poder me acojo, No hay para mí ansiedad. No temeré, si ruge Horrida tentación, Ni causará el pecado Daño en mi corazón. \r\nY cruzaré la noche Lóbrega sin temor, Hasta que venga el día De perennal fulgor. ¡Cuán placentero entonces Con mi Jesús morar, Y en la mansión de gloria Siempre con El reinar!\r\n\r\n'),
(18, 'Prueba', 'Alberto', 'Nueva conexión '),
(19, 'Prueba', 'Simon', 'Esta es una prueba');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `corosAdo`
--

CREATE TABLE `corosAdo` (
  `id_ca` int(10) NOT NULL,
  `titulo` text COLLATE utf8_unicode_ci NOT NULL,
  `autor` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `letra` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `corosAdo`
--

INSERT INTO `corosAdo` (`id_ca`, `titulo`, `autor`, `letra`) VALUES
(2, 'SANTO, SANTO, SANTO', 'Desconocido', 'Santo, santo, santo: mi corazón te adora\r\nMi corazón te sabe decir; Santo eres tú…\r\n'),
(3, 'RENUÉVAME, SEÑOR JESÚS,', 'Desconocido', 'Ya no quiero ser igual\r\nRenuévame, Señor Jesús,\r\nPon en mí, tu corazón…\r\nPorque todo lo que hay, dentro de mí\r\nNecesita ser cambiado Señor…\r\nPorque todo lo que hay, dentro de mi corazón\r\nNecesita más de ti…\r\n'),
(5, 'VENIMOS ANTE TI, SEÑOR', 'Desconocido', '//Venimos ante ti, Señor con corazones sinceros\r\nLlenos de alabanza y adoración//\r\n//Porque tú eres rey de reyes y señor de señores\r\nTú eres digno, de que todos te adoren//\r\n'),
(6, 'Si tú hablas con Dios', 'Desconocido', 'Si tú hablas con Dios,\r\nLas cosas cambiarán orando…\r\nCualquier necesidad, Él la resolverá orando…\r\nMeditad en el Señor las penas y el dolor orando.\r\n//Bendiga oración, yo puedo hablar con Dios, orando//\r\n'),
(7, 'LE AMO\r\n', 'Desconocido', 'Le amo, le amo, yo le amo\r\nEs la rosa de Sarón, para mí\r\nLe amo, le amo, yo le amo\r\nY algún día su rostro veré…'),
(8, 'DIOS ESTÁ AQUÍ\r\n', 'Desconocido', 'Dios está aquí\r\nTan cierto como el aire que respiro\r\nTan cierto como en la mañana se levanta el Sol\r\nTan cierto que cuando le hablo, me puede oír…'),
(9, 'A TI OH DIOS', 'Desconocido', 'A ti, oh Dios, levantaré mi alma\r\nA ti, oh Dios, levantaré mi alma\r\nDios mío en ti confío, tengo gozo y solaz\r\nA pesar de mi enemigo, tengo paz…'),
(10, 'ÉL ES MI PAZ\r\n', 'Desconocido', '//Él es mi paz, ha quebrado todas mis cadenas\r\nÉl es mi paz, Él es mi paz//\r\n//Echo toda mi ansiedad sobre él,\r\nÉl cuidará de mí, él es mi paz,\r\nÉl es mi paz…//Amarte solo a ti, Señor…\r\nAmarte solo a ti, Señor\r\nAmarte solo a ti, Señor\r\nAmarte solo a ti, Señor\r\nY no mirar atrás…\r\nSeguir tu caminar Señor\r\nSeguir sin desmayar Señor\r\nPostrado ante tu altar Señor\r\nY no mirar atrás…'),
(11, 'SEÑOR QUIEN ENTRARÁ', 'Desconocido', '//Señor, quien entrará en tu santuario\r\nPara adorar…//\r\n//El limpio de manos, de corazón de puro\r\nQue no es vanidoso, y sabe amar//'),
(12, 'GRACIAS CRISTO\r\n', 'Descocnocido', 'Gracias Cristo, Gracias Cristo,\r\nGracias Cristo, Gracias Cristo,\r\nLevantemos nuestras manos en señal de gratitud\r\nGracias Cristo, Gracias Cristo…\r\nAleluya, aleluya, aleluya, aleluya\r\nLevantemos nuestras manos en señal de gratitud\r\nGracias Cristo, Gracias Cristo…');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `corosAle`
--

CREATE TABLE `corosAle` (
  `id_cale` int(11) NOT NULL,
  `titulo` text COLLATE utf8_unicode_ci NOT NULL,
  `autor` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `letra` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `corosAle`
--

INSERT INTO `corosAle` (`id_cale`, `titulo`, `autor`, `letra`) VALUES
(1, ' QUE BONITO ES.', 'Desconocido', 'Que Bonito Es, Que Bonito Es Cantarle Al Señor\r\nQue Bonito Es, Que Bonito Es Cantarle Al Señor\r\n // Oh Hermano, Vamos A Cantarle\r\n Que Bonito Es, Que Bonito Es Cantarle Al Señor //'),
(2, 'COMO JEREMIAS ORABA Y ORABA.', 'Desconocido', '// Como Jeremías Oraba Y Oraba,\r\nAsí Quiero Yo, Orar Y Orar //\r\n\r\n // Y Dios Le Contestaba La Petición Que Hacia\r\n Así Quiero Yo Que Contestes La Mía //'),
(3, ' YO ME GOZO. ', 'Desconocido', 'Yo Me Gozo El Lunes, Yo Me Gozo El Martes\r\nYo Me Gozo El Miércoles\r\nYo Me Gozo El Jueves, Yo Me Gozo El Viernes\r\nSábado También\r\n\r\nY Al Llegar Domingo Sigo Con Mi Gozo Y ¿Sabes Porque?\r\n // Porque Tengo A Cristo Que Me Da La Dicha De Gozarme En El //\r\n'),
(4, 'JESÚS YO TE AMO.', 'Desconocido', '///Jesús yo te amo/// a ti,\r\nporque Tú me has amado,\r\nporque Tú me has salvado\r\nJesús yo te amo a ti.\r\n'),
(5, ' JEHOVA TU ERES MI DIOS.', 'Desconocido', ' ///Jehová Tu Eres Mi Dios Ensalzaré Y Alabare Tu Nombre /// Porque Has Hecho Maravillas Ensalzaré Y Alabare Tu Nombre'),
(6, 'YO SE QUE CRISTO VIENE.', 'Desconocido', '/ Yo Se Que Cristo Viene Y Espero Su Venida/\r\n Si Tu Estas Preparado Te Iras con El para Arriba\r\n Para Arriba, Para Arriba,\r\nPara Arriba Y No para Abajo\r\n\r\n / Subiendo, Subiendo\r\nSubiendo Y no bajando/\r\n'),
(7, 'JEHOVA ESTA EN SU TEMPLO.', 'Desconocido', '// Jehová Esta En Su Templo Alabare Al Que Vive //\r\n // Alabare, Alabare Alabare Al Que Vive //\r\nQuien Es El Que Vive- Cristo Es El Que Vive\r\nQuien Es El Que Salva- Cristo Es El Que Salva\r\nQuien Es El Que Viene Cristo Es El Que Viene\r\nQuien Es El Que Sana- Cristo Es El Que Sana\r\nSi Cristo vive a Su Nombre Gloria\r\nSi Cristo vive a Su Nombre Gloria.\r\n'),
(8, 'YO LE ALABO DE CORAZON', 'Desconocido', ' // Yo Le Alabo De Corazón Yo Le Alabo Con Mi Voz //\r\n Y Si Me Falta La Voz, Yo Le Alabo Con Mis Manos\r\n Y Si Me Faltan Las Manos, Yo Le Alabo Con Mis Pies\r\n Y Si Me Faltan Los Pies, Yo Le Alabo Con El Alma\r\n Y Si Me Falta El Alma, Es Que Ya Me Fui Con El.\r\n'),
(9, 'ALLA EN EL MONTE HOREB. ', 'Desconocido', 'Allá En El Monte Horeb La Zarza Ardía\r\n Allá En El Monte Horeb La Zarza Ardía\r\n Moisés Quería Saber Porque La Zarza Ardía\r\n Y No Se Consumía Quería Saber\r\nOyó Una Voz Del Cielo Que Le Decía Oyó Una Voz Del Cielo Que Le Decía\r\nQuita, Quita, Quita Las Sandalias De Tus Pies Porque El Lugar Que Pisas Santo Es\r\nQuita, Quita, Quita Las Sandalias De Tus Pies Porque El Lugar Que Pisas Santo Es\r\n'),
(10, 'EL HOMBRE QUE ANDUVO EN GALILEA.', 'Desconocido', 'El hombre que anduvo en galilea\r\nSe llamaba Jesús de Nazareth\r\nAhora esta conmigo, renueva así mi vida\r\naumenta cada día más y más mi fe.\r\n'),
(11, 'YO TENGO GOZO EN MI ALMA. ', 'Desconocido', 'Yo Tengo Gozo En Mi Alma ,\r\nGozo En Mi Alma Gozo En Mi Alma Y En Mi Ser\r\nSon Como Ríos De Agua Viva,\r\nRíos De Agua Viva Ríos De Agua Viva En Mi Ser.\r\n'),
(12, 'ESTE ES EL CRISTO QUE YO PREDICO.', 'Desconocido', 'Este Es El Cristo Que Yo Predico Y No Me Canso De Predicar\r\n El Sana A Los Enfermos Reprende A Los Demonios Y Calma La Tempestad\r\n\r\n // Y Yo Le Alabare, Y Yo Le Alabare\r\n Y Yo Le Alabare, Cantando Gloria A Dios //\r\n'),
(15, 'Este es el senor', 'Oscar', 'Prueba de conexion');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alabanza`
--
ALTER TABLE `alabanza`
  ADD PRIMARY KEY (`id_a`);

--
-- Indices de la tabla `corosAdo`
--
ALTER TABLE `corosAdo`
  ADD PRIMARY KEY (`id_ca`);

--
-- Indices de la tabla `corosAle`
--
ALTER TABLE `corosAle`
  ADD PRIMARY KEY (`id_cale`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alabanza`
--
ALTER TABLE `alabanza`
  MODIFY `id_a` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `corosAdo`
--
ALTER TABLE `corosAdo`
  MODIFY `id_ca` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `corosAle`
--
ALTER TABLE `corosAle`
  MODIFY `id_cale` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
