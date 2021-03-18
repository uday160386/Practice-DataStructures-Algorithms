import unittest
import programs.Factorial as fact


class TestFactorial(unittest.TestCase):
    def test_positive_scenario_1(self):
        self.assertEqual(fact.validate_factorial(4), 24, 'values are not equal')

    def test_negative_scenario_1(self):
        self.assertEqual(fact.validate_factorial(4), 25, 'values are not equal')

    def test_positive_scenario_2(self):
        self.assertEqual(fact.validate_factorial(0), 0, 'values are not equal')

    def test_positive_scenario_3(self):
        self.assertEqual(fact.validate_factorial(-1), 'INVALID NUMBER', 'values are not equal')


if __name__ == '__main__':
    unittest.main()
