package best.hyun.pgrc.type.beast

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class MecaEarthHorse : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_mecaearthhorse)
    override val type: PET_TYPE
        get() = PET_TYPE.BEAST
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_mecaearthhorse)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 88
    override val initLvMaxAtk: Int
        get() = 20
    override val initLvMaxDef: Int
        get() = 16
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1522
    override val maxLvMaxAtk: Int
        get() = 363
    override val maxLvMaxDef: Int
        get() = 281
    override val maxLvMaxSpd: Int
        get() = 186
    override val initLvMinHp: Int
        get() = 69
    override val initLvMinAtk: Int
        get() = 17
    override val initLvMinDef: Int
        get() = 12
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1309
    override val maxLvMinAtk: Int
        get() = 324
    override val maxLvMinDef: Int
        get() = 242
    override val maxLvMinSpd: Int
        get() = 154
    override val minAllGrowth: Double
        get() = 4.940
    override val maxAllGrowth: Double
        get() = 5.647
}