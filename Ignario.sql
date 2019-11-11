-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 11-11-2019 a las 02:02:06
-- Versión del servidor: 10.3.15-MariaDB
-- Versión de PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Ignario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `canciones`
--

CREATE TABLE `canciones` (
  `id_cancion` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `autor` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `letra` text COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `canciones`
--

INSERT INTO `canciones` (`id_cancion`, `id_categoria`, `nombre`, `autor`, `letra`) VALUES
(1, 1, 'Virgen eterna', 'Anuel AA', 'Sera virgen por siempre amada mia mientras tenga vida y no nos casemos XD XD XD \r\n\r\nHaciendo el amor, a la misma vez tú te toca\' (te toca\')\r\nBebé, no te pasa nada, vuélvete loca (lo-loca-loca)\r\nY tu novio te trata mal, él no te controla (no, no, no, no)\r\nHe said\r\nMi diablita (-blita)\r\nElla se pone pornográfica en la intimidad (baby)\r\nY su marido no la valora y la deja sola (la deja sola)\r\nY yo siempre la estoy esperando con mi pistola (-tola)\r\nY conmigo ella siempre se moja\r\nBebesita (uah)\r\nTu hombre te ama pero tú le ere\' infiel (bebé)\r\nPorque tú ere\' una diabla dentro de una mujer (oh oh, oh oh)\r\nY cuando se esconde el sol tú quiere\' beber, hija \'e Lucifer\r\nBebesita (mi baby, uah, uah)\r\nTu hombre te ama pero tú le ere\' infiel (¿por qué?)\r\nPorque tú ere\' una diabla dentro de una mujer (mujer)\r\nY cuando…');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL,
  `categoria` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `categoria`) VALUES
(1, 'Alabanzas'),
(2, 'Coros');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `canciones`
--
ALTER TABLE `canciones`
  ADD PRIMARY KEY (`id_cancion`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `canciones`
--
ALTER TABLE `canciones`
  MODIFY `id_cancion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `canciones`
--
ALTER TABLE `canciones`
  ADD CONSTRAINT `canciones_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
